package com.example.alerrdialog
import android.content.DialogInterface;
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addcontactDialog = AlertDialog.Builder(this )
            .setTitle("Add contacts")
            .setMessage("Do you want to add Mr. poop to your contacts list?")
            .setIcon(R.drawable.ic_action_name)
            .setPositiveButton("Yes"){ _, _->
                Toast.makeText(this,"You added Mr.poop to uour contact list",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("No"){ _, _->
                Toast.makeText(this,"You didn't added Mr.poop to uour contact list",Toast.LENGTH_SHORT).show()
            }
            .create()


           btnDialog1.setOnClickListener {
               addcontactDialog.show()
           }

        val options = arrayOf("First Item","Second Item","Third Item")
        val singleChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose one of these options")
            .setSingleChoiceItems(options, 0) { dialogInterface, i->
               Toast.makeText(this, "You clicked on ${options[i]}",Toast.LENGTH_SHORT).show()
            }

            .setPositiveButton("Accept") { _,_->
               Toast.makeText(this, "You accepted the SingleChoiceDialog",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline") { _,_->
                Toast.makeText(this, "You Declined the SingleChoiceDialog",Toast.LENGTH_SHORT).show()
            }.create()

        btnDialog2.setOnClickListener {
            singleChoiceDialog.show()
        }

        val multiChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose one of these options")
            .setMultiChoiceItems(options, booleanArrayOf(false,false,false)){_,i, isChecked->
                if(isChecked)
                {
                    Toast.makeText(this,"You checked ${options[i]}",Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(this,"You Unchecked ${options[i]}",Toast.LENGTH_SHORT).show()
                }

            }
            .setPositiveButton("Accept"){ _,_ ->
                Toast.makeText(this, "You accepted the MultiChoiceDialog",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline"){ _,_ ->
                Toast.makeText(this, "You Decline the MultiChoiceDialog",Toast.LENGTH_SHORT).show()
            }.create()
           btnDialog3.setOnClickListener {
             multiChoiceDialog.show()
         }

    }

}



