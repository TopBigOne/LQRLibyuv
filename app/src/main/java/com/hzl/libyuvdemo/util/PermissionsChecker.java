package com.hzl.libyuvdemo.util;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.content.ContextCompat;


/**
 * wuqingsen on 2020-05-26
 * Mailbox:1243411677@qq.com
 * annotation:
 */
public class PermissionsChecker {
    private final Context mContext;

    public PermissionsChecker(Context context) {
        mContext = context.getApplicationContext();
    }

    // 判断权限集合
    public boolean lacksPermissions(String... permissions) {
        for (String permission : permissions) {
            if (lacksPermission(permission)) {
                return true;
            }
        }
        return false;
    }

    // 判断是否缺少权限
    private boolean lacksPermission(String permission) {
        return ContextCompat.checkSelfPermission(mContext, permission) ==
                PackageManager.PERMISSION_DENIED;
    }

}
