package com.example.agenciaviaje

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.DialogFragment

class ReservationDialogFragment : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.dialog_reservation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val nameInput: EditText = view.findViewById(R.id.name_input)
        val dateInput: EditText = view.findViewById(R.id.date_input)
        val reserveButton: Button = view.findViewById(R.id.reserve_button)

        reserveButton.setOnClickListener {
            val name = nameInput.text.toString()
            val date = dateInput.text.toString()
            // Handle reservation logic here (e.g., save to database)
            dismiss() // Close the dialog after reserving
        }
    }
}
