package ru.nobird.android.ui.adapterssupport.selection

import android.support.v7.widget.RecyclerView

class MultipleChoiceSelectionHelper(
    private val adapter: RecyclerView.Adapter<*>
) : SelectionHelper {
    private val selectedPositions = mutableSetOf<Int>()

    override fun isSelected(position: Int): Boolean =
        position in selectedPositions

    override fun toggle(position: Int) {
        if (position in selectedPositions) {
            deselect(position)
        } else {
            select(position)
        }
    }

    override fun select(position: Int) {
        selectedPositions += position
        adapter.notifyItemChanged(position)
    }

    override fun deselect(position: Int) {
        selectedPositions -= position
        adapter.notifyItemChanged(position)
    }

    override fun reset() {
        selectedPositions.clear()
    }
}