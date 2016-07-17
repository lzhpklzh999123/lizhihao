package com.pagoda.test;

import java.io.IOException;
import android.os.RemoteException;
import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import com.pagoda.test.CtsHelper;

public class Test extends UiAutomatorTestCase {
	
	public static void main(String[] args) {
		//new UiAutomatorHelper("Demo", "com.jikexueyuan.demo.Demo1", "testBrowser", "1");
		
		String workspase, className, jarName, androidId, sdkpath;
		workspase="E:\\Workspace\\Test";
		className="com.pagoda.test.Test";
		jarName="build";
		androidId="1";
		sdkpath="E:\\UiAutomator\\SDK";
		CtsHelper cts=new CtsHelper(workspase, className, jarName, androidId, sdkpath);
		//cts.setDevices("0123456789");
		cts.runTest();

	}
	
	public void testchengshi()throws UiObjectNotFoundException, RemoteException
	{
		
        UiObject chengshiButton = new UiObject(new UiSelector().className("android.widget.TextView").index(0));  
        assertTrue("oneButton not found", chengshiButton.exists());          
        chengshiButton.click();  
        sleep(2000); 
        
	}
	
	public void testsousuo()throws UiObjectNotFoundException, RemoteException
	{
		
		
        UiDevice device = getUiDevice();  
        device.pressBack();
        sleep(2000);
        
      
	}
	//¿ìËÙµ÷ÊÔ
	/*
	public static void main(String[] args){
	   	 String jarName="build";
	   	 String testClass="com.pagoda.test.Test";
	   	 String testName="testchengshi";
	   	 String androidId="1";
	   	new UiAutomatorHelper(jarName,testClass,testName,androidId);
	    }
	    */

}
