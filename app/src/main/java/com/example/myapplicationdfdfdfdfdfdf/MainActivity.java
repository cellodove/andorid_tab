package com.example.myapplicationdfdfdfdfdfdf;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;


//곧 사라질 클래스와 메소드에 대하여 무시하고 실행한다.
@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //이전체 구조는 결국 커스텀 테그를 만들어주는것이고 만든 커스텀테그를 사용하는것이라고 생각할수있다.
        //탭호스트 클래스의 인스턴스에 탭호스트를 호출하여 할당한다.
        TabHost tabHost = getTabHost();

        //탭스펙 클래스의 인스턴스에 새로운 탭에 음악별이라는 이름을 추가하여 할당한다.
        TabHost.TabSpec tabSpec1 = tabHost.newTabSpec("TAG1").setIndicator("강아지");
        //탭스펙을 탭과 연결한다.
        tabSpec1.setContent(R.id.imageView1);
        //탭을 추가한다.
        tabHost.addTab(tabSpec1);

        //탭스펙 클래스의 인스턴스에 새로운 탭에 음악별이라는 이름을 추가하여 할당한다.
        TabHost.TabSpec tabSpec2 = tabHost.newTabSpec("TAG2").setIndicator("고양이");
        //탭스펙을 탭과 연결한다.
        tabSpec2.setContent(R.id.imageView2);
        //탭을 추가한다.
        tabHost.addTab(tabSpec2);

        //탭스펙 클래스의 인스턴스에 새로운 탭에 음악별이라는 이름을 추가하여 할당한다.
        TabHost.TabSpec tabSpec3 = tabHost.newTabSpec("TAG3").setIndicator("토끼");
        //탭스펙을 탭과 연결한다.
        tabSpec3.setContent(R.id.imageView3);
        //탭을 추가한다.
        tabHost.addTab(tabSpec3);

        //탭스펙 클래스의 인스턴스에 새로운 탭에 음악별이라는 이름을 추가하여 할당한다.
        TabHost.TabSpec tabSpec4 = tabHost.newTabSpec("TAG4").setIndicator("고릴라");
        //탭스펙을 탭과 연결한다.
        tabSpec4.setContent(R.id.imageView4);
        //탭을 추가한다.
        tabHost.addTab(tabSpec4);

        //탭을 종료한다.
        tabHost.setCurrentTab(0);

    }
}
