package com.hh.design.rmi.client;

import com.hh.design.rmi.inter.MyRemote;
import org.junit.Test;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by hjz on 2017/12/22 0022.
 */
public class MyRemoteClient {

    @Test
    public void test(){
        new MyRemoteClient().go();
    }

    private void go() {
        try{
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1:6600/RemoteHello");
            String str = service.sayHello();
            System.out.println(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
