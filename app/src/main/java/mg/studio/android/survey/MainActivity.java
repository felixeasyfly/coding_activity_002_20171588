package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);
    }
    public void WelcomeStart(android.view.View v)
    {
        switch (v.getId()) {
            case R.id.button_Start:
                CheckBox cb_accept = (CheckBox) findViewById(R.id.checkBox_accept);
                if (cb_accept.isChecked()) {
                    setContentView(R.layout.question_one);
                }
                break;
        }
    }

    public void NEXTBTNCLK_Q1(android.view.View v)
    {
        switch (v.getId()) {
            case R.id.btn_Q1:
                    setContentView(R.layout.question_two);
                break;
        }
    }

    public void NEXTBTNCLK_Q2(android.view.View v)
    {
        switch (v.getId()) {
            case R.id.btn_Q2:
                setContentView(R.layout.question_three);
                break;
        }
    }

    public void NEXTBTNCLK_Q3(android.view.View v)
    {
        switch (v.getId()) {
            case R.id.btn_Q3:
                setContentView(R.layout.question_four);
                break;
        }
    }
    public void NEXTBTNCLK_Q4(android.view.View v)
    {
        switch (v.getId()) {
            case R.id.btn_Q4:
                setContentView(R.layout.question_five);
                break;
        }
    }
    public void NEXTBTNCLK_Q5(android.view.View v)
    {
        switch (v.getId()) {
            case R.id.btn_Q5:
                setContentView(R.layout.question_six);
                break;
        }
    }
    public void NEXTBTNCLK_Q6(android.view.View v)
    {
        switch (v.getId()) {
            case R.id.btn_Q6:
                setContentView(R.layout.question_seven);
                break;
        }
    }
    public void NEXTBTNCLK_Q7(android.view.View v)
    {
        switch (v.getId()) {
            case R.id.btn_Q7:
                setContentView(R.layout.question_eight);
                break;
        }
    }
    public void NEXTBTNCLK_Q8(android.view.View v)
    {
        switch (v.getId()) {
            case R.id.btn_Q8:
                setContentView(R.layout.question_nine);
                break;
        }
    }
    public void NEXTBTNCLK_Q9(android.view.View v)
    {
        switch (v.getId()) {
            case R.id.btn_Q9:
                setContentView(R.layout.question_ten);
                break;
        }
    }
    public void NEXTBTNCLK_Q10(android.view.View v)
    {
        switch (v.getId()) {
            case R.id.btn_Q10:
                setContentView(R.layout.question_eleven);
                break;
        }
    }
    public void NEXTBTNCLK_Q11(android.view.View v)
    {
        switch (v.getId()) {
            case R.id.btn_Q11:
                setContentView(R.layout.question_twelve);
                break;
        }
    }
    public void NEXTBTNCLK_Q12(android.view.View v)
    {
        switch (v.getId()) {
            case R.id.btn_Q12:
                setContentView(R.layout.finish_survey);
                break;
        }
    }
public void exit(android.view.View v)
{
    switch (v.getId()) {
        case R.id.btn_Finish:
           System.exit(0);
            break;
    }
}
}
