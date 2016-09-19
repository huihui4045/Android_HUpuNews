package com.gzsll.hupu.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table THREAD_INFO.
 */
public class ThreadInfoDao extends AbstractDao<ThreadInfo, Void> {

    public static final String TABLENAME = "THREAD_INFO";

    /**
     * Properties of entity ThreadInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Tid = new Property(0, String.class, "tid", false, "TID");
        public final static Property Pid = new Property(1, String.class, "pid", false, "PID");
        public final static Property Page = new Property(2, Integer.class, "page", false, "PAGE");
        public final static Property Nopic = new Property(3, String.class, "nopic", false, "NOPIC");
        public final static Property PostAuthorPuid =
            new Property(4, Integer.class, "postAuthorPuid", false, "POST_AUTHOR_PUID");
        public final static Property Time = new Property(5, String.class, "time", false, "TIME");
        public final static Property UserImg =
            new Property(6, String.class, "userImg", false, "USER_IMG");
        public final static Property Author_puid =
            new Property(7, String.class, "author_puid", false, "AUTHOR_PUID");
        public final static Property Username =
            new Property(8, String.class, "username", false, "USERNAME");
        public final static Property Fid = new Property(9, String.class, "fid", false, "FID");
        public final static Property Visits =
            new Property(10, String.class, "visits", false, "VISITS");
        public final static Property Recommend_num =
            new Property(11, String.class, "recommend_num", false, "RECOMMEND_NUM");
        public final static Property Via = new Property(12, String.class, "via", false, "VIA");
        public final static Property Update_info =
            new Property(13, String.class, "update_info", false, "UPDATE_INFO");
        public final static Property Content =
            new Property(14, String.class, "content", false, "CONTENT");
        public final static Property Title =
            new Property(15, String.class, "title", false, "TITLE");
        public final static Property TotalPage =
            new Property(16, Integer.class, "totalPage", false, "TOTAL_PAGE");
        public final static Property ForumName =
            new Property(17, String.class, "forumName", false, "FORUM_NAME");
    }

    ;


    public ThreadInfoDao(DaoConfig config) {
        super(config);
    }

    public ThreadInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists ? "IF NOT EXISTS " : "";
        db.execSQL("CREATE TABLE " + constraint + "'THREAD_INFO' (" + //
            "'TID' TEXT," + // 0: tid
            "'PID' TEXT," + // 1: pid
            "'PAGE' INTEGER," + // 2: page
            "'NOPIC' TEXT," + // 3: nopic
            "'POST_AUTHOR_PUID' INTEGER," + // 4: postAuthorPuid
            "'TIME' TEXT," + // 5: time
            "'USER_IMG' TEXT," + // 6: userImg
            "'AUTHOR_PUID' TEXT," + // 7: author_puid
            "'USERNAME' TEXT," + // 8: username
            "'FID' TEXT," + // 9: fid
            "'VISITS' TEXT," + // 10: visits
            "'RECOMMEND_NUM' TEXT," + // 11: recommend_num
            "'VIA' TEXT," + // 12: via
            "'UPDATE_INFO' TEXT," + // 13: update_info
            "'CONTENT' TEXT," + // 14: content
            "'TITLE' TEXT," + // 15: title
            "'TOTAL_PAGE' INTEGER," + // 16: totalPage
            "'FORUM_NAME' TEXT);"); // 17: forumName
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'THREAD_INFO'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override protected void bindValues(SQLiteStatement stmt, ThreadInfo entity) {
        stmt.clearBindings();

        String tid = entity.getTid();
        if (tid != null) {
            stmt.bindString(1, tid);
        }

        String pid = entity.getPid();
        if (pid != null) {
            stmt.bindString(2, pid);
        }

        Integer page = entity.getPage();
        if (page != null) {
            stmt.bindLong(3, page);
        }

        String nopic = entity.getNopic();
        if (nopic != null) {
            stmt.bindString(4, nopic);
        }

        Integer postAuthorPuid = entity.getPostAuthorPuid();
        if (postAuthorPuid != null) {
            stmt.bindLong(5, postAuthorPuid);
        }

        String time = entity.getTime();
        if (time != null) {
            stmt.bindString(6, time);
        }

        String userImg = entity.getUserImg();
        if (userImg != null) {
            stmt.bindString(7, userImg);
        }

        String author_puid = entity.getAuthor_puid();
        if (author_puid != null) {
            stmt.bindString(8, author_puid);
        }

        String username = entity.getUsername();
        if (username != null) {
            stmt.bindString(9, username);
        }

        String fid = entity.getFid();
        if (fid != null) {
            stmt.bindString(10, fid);
        }

        String visits = entity.getVisits();
        if (visits != null) {
            stmt.bindString(11, visits);
        }

        String recommend_num = entity.getRecommend_num();
        if (recommend_num != null) {
            stmt.bindString(12, recommend_num);
        }

        String via = entity.getVia();
        if (via != null) {
            stmt.bindString(13, via);
        }

        String update_info = entity.getUpdate_info();
        if (update_info != null) {
            stmt.bindString(14, update_info);
        }

        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(15, content);
        }

        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(16, title);
        }

        Integer totalPage = entity.getTotalPage();
        if (totalPage != null) {
            stmt.bindLong(17, totalPage);
        }

        String forumName = entity.getForumName();
        if (forumName != null) {
            stmt.bindString(18, forumName);
        }
    }

    /** @inheritdoc */
    @Override public Void readKey(Cursor cursor, int offset) {
        return null;
    }    

    /** @inheritdoc */
    @Override public ThreadInfo readEntity(Cursor cursor, int offset) {
        ThreadInfo entity = new ThreadInfo( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // tid
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // pid
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // page
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // nopic
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // postAuthorPuid
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // time
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // userImg
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // author_puid
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // username
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // fid
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // visits
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // recommend_num
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // via
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // update_info
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // content
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // title
            cursor.isNull(offset + 16) ? null : cursor.getInt(offset + 16), // totalPage
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17) // forumName
        );
        return entity;
    }

    /** @inheritdoc */
    @Override public void readEntity(Cursor cursor, ThreadInfo entity, int offset) {
        entity.setTid(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setPid(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setPage(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setNopic(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setPostAuthorPuid(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setTime(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setUserImg(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setAuthor_puid(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setUsername(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setFid(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setVisits(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setRecommend_num(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setVia(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setUpdate_info(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setContent(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setTitle(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setTotalPage(cursor.isNull(offset + 16) ? null : cursor.getInt(offset + 16));
        entity.setForumName(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
    }
    
    /** @inheritdoc */
    @Override protected Void updateKeyAfterInsert(ThreadInfo entity, long rowId) {
        // Unsupported or missing PK type
        return null;
    }

    /** @inheritdoc */
    @Override public Void getKey(ThreadInfo entity) {
        return null;
    }

    /** @inheritdoc */
    @Override protected boolean isEntityUpdateable() {
        return true;
    }
}
