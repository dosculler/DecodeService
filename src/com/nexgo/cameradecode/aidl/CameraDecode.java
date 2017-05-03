/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: Z:\\CameraDecodeService\\src\\com\\nexgo\\cameradecode\\aidl\\CameraDecode.aidl
 */
package com.nexgo.cameradecode.aidl;
public interface CameraDecode extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.nexgo.cameradecode.aidl.CameraDecode
{
private static final java.lang.String DESCRIPTOR = "com.nexgo.cameradecode.aidl.CameraDecode";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.nexgo.cameradecode.aidl.CameraDecode interface,
 * generating a proxy if needed.
 */
public static com.nexgo.cameradecode.aidl.CameraDecode asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.nexgo.cameradecode.aidl.CameraDecode))) {
return ((com.nexgo.cameradecode.aidl.CameraDecode)iin);
}
return new com.nexgo.cameradecode.aidl.CameraDecode.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_initScanner:
{
data.enforceInterface(DESCRIPTOR);
android.os.Bundle _arg0;
if ((0!=data.readInt())) {
_arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.initScanner(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_startScan:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
com.nexgo.cameradecode.aidl.OnDecodeListener _arg1;
_arg1 = com.nexgo.cameradecode.aidl.OnDecodeListener.Stub.asInterface(data.readStrongBinder());
int _result = this.startScan(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_stopScan:
{
data.enforceInterface(DESCRIPTOR);
this.stopScan();
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.nexgo.cameradecode.aidl.CameraDecode
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void initScanner(android.os.Bundle bundle) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((bundle!=null)) {
_data.writeInt(1);
bundle.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_initScanner, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int startScan(int timeout, com.nexgo.cameradecode.aidl.OnDecodeListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(timeout);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_startScan, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void stopScan() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopScan, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_initScanner = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_startScan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_stopScan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public void initScanner(android.os.Bundle bundle) throws android.os.RemoteException;
public int startScan(int timeout, com.nexgo.cameradecode.aidl.OnDecodeListener listener) throws android.os.RemoteException;
public void stopScan() throws android.os.RemoteException;
}
