package com.test.week_2;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Handling system insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize TextViews and EditTexts and set text from strings.xml
        TextView textExpenseTracker = findViewById(R.id.textView);
        TextView textAmount = findViewById(R.id.textView2);
        TextView textCategory = findViewById(R.id.textView3);
        TextView textRemark = findViewById(R.id.textView5);
        TextView textUSD = findViewById(R.id.radioButton);
        TextView textKHR = findViewById(R.id.radioButton2);
        EditText editTextAmount = findViewById(R.id.editTextText);
        EditText editTextFoodHint = findViewById(R.id.editTextText3);
        EditText editTextRemarkHint = findViewById(R.id.editTextText2);
        TextView textAddExpense = findViewById(R.id.button);

        textExpenseTracker.setText(getString(R.string.expense_tracker));
        textAmount.setText(getString(R.string.amount));
        textCategory.setText(getString(R.string.category));
        textRemark.setText(getString(R.string.remark));
        textUSD.setText(getString(R.string.usd));
        textKHR.setText(getString(R.string.khr));
        editTextAmount.setHint(getString(R.string.amount_hint)); // Amount hint added here
        editTextFoodHint.setHint(getString(R.string.food_hint));
        editTextRemarkHint.setHint(getString(R.string.remark_hint));
        textAddExpense.setText(getString(R.string.add_expense));

        // Set text color for TextViews
        textExpenseTracker.setTextColor(getResources().getColor(android.R.color.white));
        textAmount.setTextColor(getResources().getColor(android.R.color.white));
        textCategory.setTextColor(getResources().getColor(android.R.color.white));
        textRemark.setTextColor(getResources().getColor(android.R.color.white));
        textUSD.setTextColor(getResources().getColor(android.R.color.white));
        textKHR.setTextColor(getResources().getColor(android.R.color.white));
        textAddExpense.setTextColor(getResources().getColor(android.R.color.black));

        // Set hint color for EditTexts
        editTextAmount.setHintTextColor(getResources().getColor(android.R.color.black));
        editTextFoodHint.setHintTextColor(getResources().getColor(android.R.color.black));
        editTextRemarkHint.setHintTextColor(getResources().getColor(android.R.color.black));


    }
}
