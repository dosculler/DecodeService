/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: Z:\\CameraDecodeService\\src\\com\\nexgo\\cameradecode\\aidl\\OnDecodeListener.aidl
 */
package com.nexgo.cameradecode.aidl;
// Declare any non-default types here with import statements

public interface OnDecodeListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.nexgo.cameradecode.aidl.OnDecodeListener
{
private static final java.lang.String DESCRIPTOR = "com.nexgo.cameradecode.aidl.OnDecodeListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.nexgo.cameradecode.aidl.OnDecodeListener interface,
 * generating a proxy if needed.
 */
public static com.nexgo.cameradecode.aidl.OnDecodeListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.nexgo.cameradecode.aidl.OnDecodeListener))) {
return ((com.nexgo.cameradecode.aidl.OnDecodeListener)iin);
}
return new com.nexgo.cameradecode.aidl.OnDecodeListener.Stub.Proxy(obj);
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
case TRANSACTION_onDecodeResult:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _arg1;
_arg1 = data.readString();
this.onDecodeResult(_arg0, _arg1);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.nexgo.cameradecode.aidl.OnDecodeListener
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
@Override public void onDecodeResult(int retCode, java.lang.String data) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(retCode);
_data.writeString(data);
mRemote.transact(Stub.TRANSACTION_onDecodeResult, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_onDecodeResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void onDecodeResult(int retCode, java.lang.String data) throws android.os.RemoteException;
}
