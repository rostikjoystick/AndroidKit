package ru.nobird.android.presentation.redux.reducer

interface StateReducer<State, Message, Action> {
    fun reduce(state: State, message: Message): Pair<State, Set<Action>>
}