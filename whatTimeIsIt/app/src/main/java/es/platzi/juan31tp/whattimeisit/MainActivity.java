package es.platzi.juan31tp.whattimeisit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

/*Imports para conseguir fecha y hora*/
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showDate();
        showTime();
    }

    private void showTime() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss");
        setTime(calendar, simpleDateFormat);
    }

    private void setTime(Calendar calendar, SimpleDateFormat simpleDateFormat) {
        TextView lblCurrentTime = findViewById(R.id.lblCurrenTime);
        String currentTime = simpleDateFormat.format(calendar.getTime());
        lblCurrentTime.setText(currentTime);
    }

    private void showDate() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        setDate(calendar, simpleDateFormat);
    }

    private void setDate(Calendar calendar, SimpleDateFormat simpleDateFormat) {
        TextView lblCurrentDate = findViewById(R.id.lblCurrentDate);
        String currentDate = simpleDateFormat.format(calendar.getTime());
        lblCurrentDate.setText(currentDate);
    }


}