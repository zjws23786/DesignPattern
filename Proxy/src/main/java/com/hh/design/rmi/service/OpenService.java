package com.hh.design.rmi.service;

import com.hh.design.rmi.impl.MyRemoteImpl;
import com.hh.design.rmi.inter.MyRemote;
import org.junit.Test;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 * Created by hjz on 2017/12/22 0022.
 */
public class OpenService {

    @Test
    public void openServiceTest(){
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("rmi://127.0.0.1:6600/RemoteHello", service);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

}
