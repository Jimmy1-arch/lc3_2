// -------------------activity_main.xml-------------------

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="24dp">

    <EditText
        android:id="@+id/etName"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Student Name"
        android:inputType="textPersonName" />

    <EditText
        android:id="@+id/etRollNo"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Roll Number"
        android:inputType="text" />

    <EditText
        android:id="@+id/etCourse"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Course"
        android:inputType="text" />

    <Button
        android:id="@+id/btnSubmit"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Submit" />

</LinearLayout>
```
// -------------------MainActivity.java-------------------

```java
package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText etName, etRollNo, etCourse;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etRollNo = findViewById(R.id.etRollNo);
        etCourse = findViewById(R.id.etCourse);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(v -> {
            String name = etName.getText().toString();
            String rollNo = etRollNo.getText().toString();
            String course = etCourse.getText().toString();

            Intent intent = new Intent(
                MainActivity.this,
                SecondActivity.class
            );

            intent.putExtra("name", name);
            intent.putExtra("rollNo", rollNo);
            intent.putExtra("course", course);

            startActivity(intent);
        });
    }
}
```
// -------------------activity_second.xml-------------------

```java
package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView tvDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvDetails = findViewById(R.id.tvDetails);

        String name = getIntent().getStringExtra("name");
        String rollNo = getIntent().getStringExtra("rollNo");
        String course = getIntent().getStringExtra("course");

        String details =
                "Student Name: " + name +
                "\nRoll Number: " + rollNo +
                "\nCourse: " + course;

        tvDetails.setText(details);
    }
}
```
// -------------------SecondActivity.java-------------------

```java
package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView tvDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvDetails = findViewById(R.id.tvDetails);

        String name = getIntent().getStringExtra("name");
        String rollNo = getIntent().getStringExtra("rollNo");
        String course = getIntent().getStringExtra("course");

        String details =
                "Student Name: " + name +
                "\nRoll Number: " + rollNo +
                "\nCourse: " + course;

        tvDetails.setText(details);
    }
}
```
