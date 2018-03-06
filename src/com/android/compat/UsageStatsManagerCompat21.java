package com.android.compat;

import android.content.Context;
import android.content.Intent;
import android.os.Build;

public class UsageStatsManagerCompat21 {

	public static void goUsageStats(Context context) {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
			Intent intent = new Intent("android.settings.USAGE_ACCESS_SETTINGS");
			intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			context.startActivity(intent);
		}
	}
}
