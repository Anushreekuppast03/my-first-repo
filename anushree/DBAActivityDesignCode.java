package com.example.anushree;
 
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DBAActivityDesignCode extends Activity {
	EditText editRollno,editName,editMarks;
	Button btnAdd,btnDelete,btnModify,btnView,btnViewAll;
	SQLiteDatabase db;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dbaactivity_design_code);

		
		 editRollno=(EditText)findViewById(R.id.editText2);
		 editName=(EditText)findViewById(R.id.editText4);
		 editMarks=(EditText)findViewById(R.id.editText1);
		 btnAdd=(Button)findViewById(R.id.btnADD);
		 btnDelete=(Button)findViewById(R.id.btnDelete);
		 btnModify=(Button)findViewById(R.id.btnModify);
		 btnView=(Button)findViewById(R.id.btnView);
		 btnViewAll=(Button)findViewById(R.id.btnViewAll);
		 db=openOrCreateDatabase("StudentDB", Context.MODE_PRIVATE, null);
		 db.execSQL("CREATE TABLE IF NOT EXISTS student(rollno VARCHAR,name VARCHAR,marks VARCHAR);");

		 btnAdd.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if(editRollno.getText().toString().trim().length()==0||
						 editName.getText().toString().trim().length()==0||
						 editMarks.getText().toString().trim().length()==0)
						 {
						 showMessage("Error", "Please enter all values");
						 return;
						 }
						 db.execSQL("INSERT INTO student VALUES('"+editRollno.getText()+"','"+editName.getText()+
						 "','"+editMarks.getText()+"');");
						 showMessage("Success", "Record added");
						 clearText();
				
			}
		});
		 btnDelete.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					if(editRollno.getText().toString().trim().length()==0)
					 {
					 showMessage("Error", "Please enter Rollno");
					 return;
					 }
		Cursor c=db.rawQuery("SELECT * FROM student WHERE rollno='"+editRollno.getText()+"'", null);
					 if(c.moveToFirst())
					 {
		db.execSQL("DELETE FROM student WHERE rollno='"+editRollno.getText()+"'");
					 showMessage("Success", "Record Deleted");
					 }
					 else
					 {
					 showMessage("Error", "Invalid Rollno");
					 }
					//clearText();			
				}
			});


		 btnModify.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					 if(editRollno.getText().toString().trim().length()==0)
					 {
					 showMessage("Error", "Please enter Rollno");
					 return;
					 }
					 Cursor c=db.rawQuery("SELECT * FROM student WHERE rollno='"+editRollno.getText()+"'", null);
					 if(c.moveToFirst())
					 {
					 db.execSQL("UPDATE student SET name='"+editName.getText()+"',marks='"+editMarks.getText()+
					 "' WHERE rollno='"+editRollno.getText()+"'");
					 showMessage("Success", "Record Modified");
					 }
					 else
					 {
					 showMessage("Error", "Invalid Rollno");
					 }
					 clearText();
					
				}
			});
		 btnView.setOnClickListener(new View.OnClickListener() {		
				@Override
				public void onClick(View v) {
					if(editRollno.getText().toString().trim().length()==0)
					 {
					 showMessage("Error", "Please enter Rollno");
					 return;
					 }
		 Cursor c=db.rawQuery("SELECT * FROM student WHERE rollno='"+editRollno.getText()+"'", null);
					 if(c.moveToFirst())
					 {
					 editName.setText(c.getString(1));
					 editMarks.setText(c.getString(2));
					 }
					 else
					 {
					 showMessage("Error", "Invalid Rollno");
					 clearText();
					 }			
				}
			});

		 btnViewAll.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					 Cursor c=db.rawQuery("SELECT * FROM student", null);

					 if(c.getCount()==0)
					 {
					 showMessage("Error", "No records found");
					 return;
					 }
					 StringBuffer buffer=new StringBuffer();
					 while(c.moveToNext())
					 {
					 buffer.append("Rollno: "+c.getString(0)+"\n");
					 buffer.append("Name: "+c.getString(1)+"\n");
					 buffer.append("Marks: "+c.getString(2)+"\n\n");
					 }
					 showMessage("Student Details", buffer.toString());			 	
				}
			});
		 }

		public void showMessage(String title,String message)
		 {
		 Builder builder=new Builder(this);
		 builder.setCancelable(true);
		 builder.setTitle(title);
		 builder.setMessage(message);
		 builder.show();
		}
		 public void clearText()
		 {
		 editRollno.setText("");
		 editName.setText("");
		 editMarks.setText("");
		 editRollno.requestFocus();
		 }
		}

