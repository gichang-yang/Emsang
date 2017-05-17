package wala.wala.yang_gichang.emsang;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;

import com.wala.yang_gichang.emsang.R;

public class Choice extends AppCompatActivity {
    int member=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice);
    }

    //rand method is used to set number of participants.

    public void rand(View v){
        InputMethodManager mInputMethodManager = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);//called for son method that hiding keyboard when input is finished.
        final EditText editText = (EditText) findViewById(R.id.editText);
        mInputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);//hide keyboard.


        String init=editText.getText().toString();
        if(init.equals("")) {
            Toast.makeText(getBaseContext(),"입력값이 없습니다.",Toast.LENGTH_SHORT).show();
            return;
        }
        //Toast.makeText(getBaseContext(),""+editText.getText().toString(),Toast.LENGTH_SHORT).show();
        member = (int)Integer.parseInt(init);
        Toast.makeText(getBaseContext(),""+member,Toast.LENGTH_LONG).show();
        if(editText.getText().toString()==null) member=1;
        Intent intent = new Intent(getApplicationContext(),ChoicePlayActivity.class);


        intent.putExtra("member",member);
        startActivity(intent);
        finish();

    }
}
