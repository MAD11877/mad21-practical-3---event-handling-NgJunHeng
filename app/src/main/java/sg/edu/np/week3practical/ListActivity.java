package sg.edu.np.week3practical;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class ListActivity extends AppCompatActivity {
    private final static String TAG = "Main Activity";
    private TextView message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ImageView img1 = findViewById(R.id.imageView2);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Image Pressed!");
                userPressed();

            }



        });
    }

    //Generating random number
    private void randomNumber()
    {
        Random ran = new Random();
        int ranNum= ran.nextInt(10000);


        Intent intent = new Intent(ListActivity.this, MainActivity.class);
        intent.putExtra("Number", ranNum);
        startActivity(intent);
    }



    private void userPressed()
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("MADness");
        builder.setTitle("Profile");
        builder.setCancelable(false);
        builder.setNegativeButton("Close", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        builder.setPositiveButton("View", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                randomNumber();

            }
        });

        //To show the alert dialog
        AlertDialog alert = builder.create();
        alert.show();

    }

    private void viewOutput (){


    }
}