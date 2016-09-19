package com.gzsll.hupu.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table USER.
 */
public class UserDao extends AbstractDao<User, Long> {

    public static final String TABLENAME = "USER";

    /**
     * Properties of entity User.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property UserName =
            new Property(1, String.class, "userName", false, "USER_NAME");
        public final static Property Uid = new Property(2, String.class, "uid", false, "UID");
        public final static Property Token = new Property(3, String.class, "token", false, "TOKEN");
        public final static Property Icon = new Property(4, String.class, "icon", false, "ICON");
        public final static Property Sex = new Property(5, Integer.class, "sex", false, "SEX");
        public final static Property Cookie =
            new Property(6, String.class, "cookie", false, "COOKIE");
        public final static Property RegisterTime =
            new Property(7, String.class, "registerTime", false, "REGISTER_TIME");
        public final static Property Location =
            new Property(8, String.class, "location", false, "LOCATION");
        public final static Property School =
            new Property(9, String.class, "school", false, "SCHOOL");
        public final static Property ThreadUrl =
            new Property(10, String.class, "threadUrl", false, "THREAD_URL");
        public final static Property PostUrl =
            new Property(11, String.class, "postUrl", false, "POST_URL");
        public final static Property NickNameUrl =
            new Property(12, String.class, "nickNameUrl", false, "NICK_NAME_URL");
    }

    ;


    public UserDao(DaoConfig config) {
        super(config);
    }

    public UserDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists ? "IF NOT EXISTS " : "";
        db.execSQL("CREATE TABLE " + constraint + "'USER' (" + //
            "'_id' INTEGER PRIMARY KEY ," + // 0: id
            "'USER_NAME' TEXT," + // 1: userName
            "'UID' TEXT," + // 2: uid
            "'TOKEN' TEXT," + // 3: token
            "'ICON' TEXT," + // 4: icon
            "'SEX' INTEGER," + // 5: sex
            "'COOKIE' TEXT," + // 6: cookie
            "'REGISTER_TIME' TEXT," + // 7: registerTime
            "'LOCATION' TEXT," + // 8: location
            "'SCHOOL' TEXT," + // 9: school
            "'THREAD_URL' TEXT," + // 10: threadUrl
            "'POST_URL' TEXT," + // 11: postUrl
            "'NICK_NAME_URL' TEXT);"); // 12: nickNameUrl
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'USER'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override protected void bindValues(SQLiteStatement stmt, User entity) {
        stmt.clearBindings();

        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }

        String userName = entity.getUserName();
        if (userName != null) {
            stmt.bindString(2, userName);
        }

        String uid = entity.getUid();
        if (uid != null) {
            stmt.bindString(3, uid);
        }

        String token = entity.getToken();
        if (token != null) {
            stmt.bindString(4, token);
        }

        String icon = entity.getIcon();
        if (icon != null) {
            stmt.bindString(5, icon);
        }

        Integer sex = entity.getSex();
        if (sex != null) {
            stmt.bindLong(6, sex);
        }

        String cookie = entity.getCookie();
        if (cookie != null) {
            stmt.bindString(7, cookie);
        }

        String registerTime = entity.getRegisterTime();
        if (registerTime != null) {
            stmt.bindString(8, registerTime);
        }

        String location = entity.getLocation();
        if (location != null) {
            stmt.bindString(9, location);
        }

        String school = entity.getSchool();
        if (school != null) {
            stmt.bindString(10, school);
        }

        String threadUrl = entity.getThreadUrl();
        if (threadUrl != null) {
            stmt.bindString(11, threadUrl);
        }

        String postUrl = entity.getPostUrl();
        if (postUrl != null) {
            stmt.bindString(12, postUrl);
        }

        String nickNameUrl = entity.getNickNameUrl();
        if (nickNameUrl != null) {
            stmt.bindString(13, nickNameUrl);
        }
    }

    /** @inheritdoc */
    @Override public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override public User readEntity(Cursor cursor, int offset) {
        User entity = new User( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // userName
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // uid
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // token
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // icon
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // sex
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // cookie
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // registerTime
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // location
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // school
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // threadUrl
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // postUrl
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12) // nickNameUrl
        );
        return entity;
    }

    /** @inheritdoc */
    @Override public void readEntity(Cursor cursor, User entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setUserName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setUid(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setToken(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setIcon(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setSex(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setCookie(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setRegisterTime(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setLocation(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setSchool(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setThreadUrl(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setPostUrl(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setNickNameUrl(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
    }
    
    /** @inheritdoc */
    @Override protected Long updateKeyAfterInsert(User entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }

    /** @inheritdoc */
    @Override public Long getKey(User entity) {
        if (entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override protected boolean isEntityUpdateable() {
        return true;
    }
}
