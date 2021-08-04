package com.saidul.project_utility.utlity.appVersionCheck;

import com.saidul.project_utility.utility.appVersionCheck.AppVersionHelper;

import org.junit.Test;

/**
 * Created by Kazi Md. Saidul Email: Kazimdsaidul@gmail.com  Mobile: +8801675349882 on 8/4/21.
 */
public class AppVersionHelperTest {

    @Test
    public void testVv1IsGreaterThanv2(){
        int i = AppVersionHelper.versionCompare("4.0.1", "4.0.2");

        if (i == 1) {
            //The result is 1 if v1 is greater than v2.
            assert false;
        } else if (i == 2) {
            //The result is 2 if v2 is greater than v1.
            assert true;
        } else if (i == -1) {
            //The result is -1 if the version format is unrecognized.
            assert false;
        } else if (i == 0) {
            //The result is zero if the strings are equal.
            assert false;
        }
    }

    @Test
    public void testV2IsGreaterThanv1(){
        int i = AppVersionHelper.versionCompare("4.0.2", "4.0.1");
        if (i == 1) {
            //The result is 1 if v1 is greater than v2.
            assert true;
        } else if (i == 2) {
            //The result is 2 if v2 is greater than v1.
            assert true;
        } else if (i == -1) {
            //The result is -1 if the version format is unrecognized.
            assert false;
        } else if (i == 0) {
            //The result is zero if the strings are equal.
            assert false;
        }
    }

    @Test
    public void testV1equalv2(){
        int i = AppVersionHelper.versionCompare("4.0.0", "4.0.0");
        if (i == 1) {
            //The result is 1 if v1 is greater than v2.
            assert false;
        } else if (i == 2) {
            //The result is 2 if v2 is greater than v1.
            assert false;
        } else if (i == -1) {
            //The result is -1 if the version format is unrecognized.
            assert false;
        } else if (i == 0) {
            //The result is zero if the strings are equal.
            assert true;
        }
    }

    @Test
    public void testformatIsUnrecognized(){
        int i = AppVersionHelper.versionCompare("sdfdf", "4.0");
        if (i == 1) {
            //The result is 1 if v1 is greater than v2.
            assert false;
        } else if (i == 2) {
            //The result is 2 if v2 is greater than v1.
            assert false;
        } else if (i == -1) {
            //The result is -1 if the version format is unrecognized.
            assert true;
        } else if (i == 0) {
            //The result is zero if the strings are equal.
            assert false;
        }
    }

    @Test
    public void testV2IsGreaterThanv1More(){
        int i = AppVersionHelper.versionCompare("2.0", "4.0");
        if (i == 1) {
            //The result is 1 if v1 is greater than v2.
            assert false;
        } else if (i == 2) {
            //The result is 2 if v2 is greater than v1.
            assert true;
        } else if (i == -1) {
            //The result is -1 if the version format is unrecognized.
            assert false;
        } else if (i == 0) {
            //The result is zero if the strings are equal.
            assert false;
        }
    }

}