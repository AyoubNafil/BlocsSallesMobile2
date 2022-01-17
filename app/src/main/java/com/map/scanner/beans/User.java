package com.map.scanner.beans;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {
    private int id;
    private String email;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(int id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }
    @Override
    public int describeContents() {
        return 0;
    }
    public User(Parcel in) {
        id = in.readInt();
        password = in.readString();
    }
    @Override
    public void writeToParcel(Parcel dest, int arg1) {
        // TODO Auto-generated method stub
        dest.writeInt(id);
        dest.writeString(password);
    }
    public static final Creator<User> CREATOR = new Creator<User>() {
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        public User[] newArray(int size) {
            return new User[size];
        }
    };
}
