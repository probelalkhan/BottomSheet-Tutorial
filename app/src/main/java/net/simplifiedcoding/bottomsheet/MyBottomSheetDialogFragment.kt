package net.simplifiedcoding.bottomsheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.bottom_sheet_modal.*

class MyBottomSheetDialogFragment : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.bottom_sheet_modal, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val options = listOf<String>(
            "Share with Friends",
            "Bookmark",
            "Add to Favourites",
            "More Information"
        )

        listViewOptions.adapter = ArrayAdapter<String>(
            requireContext(),
            android.R.layout.simple_list_item_1,
            options
        )
    }
}