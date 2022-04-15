package com.example.flutter.tester.flutter_tester;

import android.os.Bundle;

import androidx.annotation.Nullable;
import cn.smssdk.flutter.MobsmsPlugin;
import io.flutter.embedding.android.FlutterActivity;

public class MainActivity extends FlutterActivity {
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// 注册SMSSDK Flutter插件
		MobsmsPlugin.registerWith(registrarFor(SmssdkPlugin.CHANNEL));
	}
}
