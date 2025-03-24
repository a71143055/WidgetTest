package kr.ac.kopo.widgettest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import kr.ac.kopo.widgettest.R;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enable_clickable_test);

        // RadioGroup 초기화
    /*    radioGroup = findViewById(R.id.radioGroup);

        // 버튼 및 클릭 이벤트 설정
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = "";
                // 선택된 라디오 버튼 확인
                if (radioGroup.getCheckedRadioButtonId() == R.id.male)
                    result = "남성";
                else if (radioGroup.getCheckedRadioButtonId() == R.id.female)
                    result = "여성";
                else
                    result = "";
                // Toast 메시지 출력
                Toast.makeText(MainActivity.this, result + "을 선택하였습니다.", Toast.LENGTH_LONG).show();
            }
        });*/
    }
}
