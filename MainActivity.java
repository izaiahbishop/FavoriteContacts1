package css.cis3334.favoritecontacts;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1Call, btn1Text, btn2Call, btn2Text, btn3Call, btn3Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupButtonClickEvents();
    }

    private void setupButtonClickEvents() {
        btn1Call = (Button) findViewById(R.id.buttonCallPerson1);
        btn1Call.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + "2188675309"));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        btn1Text = (Button) findViewById(R.id.buttonTextPerson1);
        btn1Text.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms:2188675309"));
                sendIntent.putExtra("sms_body", "Hi");
                startActivity(sendIntent);
            }
        });

        btn2Call = (Button) findViewById(R.id.buttonCallPerson2);
        btn2Call.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + "2189527145"));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        btn2Text = (Button) findViewById(R.id.buttonTextPerson2);
        btn2Text.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms:2189527145"));
                sendIntent.putExtra("sms_body", "Hi");
                startActivity(sendIntent);
            }
        });

        btn3Call = (Button) findViewById(R.id.buttonCallPerson3);
        btn3Call.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + "2187654126"));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        btn3Text = (Button) findViewById(R.id.buttonTextPerson3);
        btn3Text.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms:2187654126"));
                sendIntent.putExtra("sms_body", "Hi");
                startActivity(sendIntent);
            }
        });

    }
}



