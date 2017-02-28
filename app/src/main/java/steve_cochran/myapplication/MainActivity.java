package steve_cochran.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public TextView textView;
    private String count = "";
    private String fullCount = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.textView);


    }


    public void c0(View v){

        if( count == "0" || count == "" ){
        } else {

            count = count + "0";

            textView.setText(count);

            Log.d("textView", textView.toString());

        }
    }

    public void c1(View v){


        if( count == "0" || count == "" ){
            count = "1";
            textView.setText(count);

        } else {

            count = count + "1";

            textView.setText(count);

        }

    }

    public void c2(View v){


        if( count == "0" || count == "" ){
            count = "2";
            textView.setText(count);

        } else {

            count = count + "2";

            textView.setText(count);


        }

    }

    public void c3(View v){



        if( count == "0" || count == "" ){
            count = "3";
            textView.setText(count);

        } else {

            count = count + "3";

            textView.setText(count);

        }

    }

    public void c4(View v){


        if( count == "0" || count == "" ){
            count = "4";
            textView.setText(count);

        } else {

            count = count + "4";

            textView.setText(count);

        }

    }

    public void c5(View v){


        if( count == "0" || count == "" ){
            count = "5";
            textView.setText(count);

        } else {

            count = count + "5";

            textView.setText(count);

        }

    }

    public void c6(View v){


        if( count == "0" || count == "" ){
            count = "6";
            textView.setText(count);

        } else {

            count = count + "6";

            textView.setText(count);

        }

    }

    public void c7(View v){


        if( count == "0" || count == "" ){
            count = "7";
            textView.setText(count);

        } else {

            count = count + "7";

            textView.setText(count);

        }

    }

    public void c8(View v){


        if( count == "0" || count == "" ){
            count = "8";
            textView.setText(count);

        } else {

            count = count + "8";

            textView.setText(count);

        }

    }

    public void c9(View v){


        if( count == "0" || count == "" ){
            count = "9";
            textView.setText(count);

        } else {

            count = count + "9";

            textView.setText(count);

            Log.d("textView", textView.toString());

        }
    }

    public void cClear(View v){

        count = "0";
        fullCount = "0";
        textView.setText(count);

        Log.d("textView", textView.toString());

    }

    public void cNeg(View v){

        count = "-" + count;
        textView.setText(count.toString());

        Log.d("textView", textView.toString());

    }

    public void cPer(View v){

        count = count + 1;
        textView.setText(count.toString());

        Log.d("textView", textView.toString());

    }

    public void cDivide(View v){

        count = count + 1;
        textView.setText(count.toString());

        Log.d("textView", textView.toString());

    }

    public void cMult(View v){

        count = count + 1;
        textView.setText(count.toString());

        Log.d("textView", textView.toString());

    }

    public void cSub(View v){

        fullCount = count;
        count = "0";

        textView.setText(count.toString());

        Log.d("textView", textView.toString());


    }

    public void cAdd(View v){
        fullCount = count;
        count = "0";

        textView.setText(count.toString());

        Log.d("textView", textView.toString());

    }

    public void cEquals(View v){

        int i1 = Integer.parseInt(fullCount);
        int i2 = Integer.parseInt(count);
        Integer rtnval;

        rtnval = i1 + i2;

        textView.setText(rtnval.toString());

        Log.d("textView", textView.toString());

    }

    public void cDec(View v){

        count = count + 1;
        textView.setText(count.toString());

        Log.d("textView", textView.toString());

    }
}
