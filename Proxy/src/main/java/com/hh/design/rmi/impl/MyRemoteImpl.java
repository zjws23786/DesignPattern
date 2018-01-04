package com.hh.design.rmi.impl;

import com.hh.design.rmi.inter.MyRemote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by hjz on 2017/12/22 0022.
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    public MyRemoteImpl() throws RemoteException {
        super();
    }

    public String sayHello() throws RemoteException {
        return "Hello World!";
    }
}
