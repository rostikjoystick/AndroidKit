package ru.nobird.android.presentation.redux.dispatcher

import ru.nobird.android.presentation.redux.feature.Feature

fun <State, Message, Action> Feature<State, Message, Action>.wrapWithActionDispatcher(
    dispatcher: ActionDispatcher<Action, Message>
): Feature<State, Message, Action> =
    object : Feature<State, Message, Action> by this {
        override fun cancel() { dispatcher.cancel() }
    }.apply {
        dispatcher.setListener(::onNewMessage)
        addActionListener(dispatcher::handleAction)
    }

fun <Action1, Action2, Message1, Message2> ActionDispatcher<Action1, Message1>.tranform(
    transformAction: (Action2) -> Action1?,
    transformMessage: (Message1) -> Message2?
) : ActionDispatcher<Action2, Message2> =
    object : ActionDispatcher<Action2, Message2> {
        override fun setListener(listener: (message: Message2) -> Unit) {
            this@tranform.setListener { transformMessage(it)?.let(listener) }
        }

        override fun handleAction(action: Action2) {
            transformAction(action)?.let(this@tranform::handleAction)
        }

        override fun cancel() {
            this@tranform.cancel()
        }
    }