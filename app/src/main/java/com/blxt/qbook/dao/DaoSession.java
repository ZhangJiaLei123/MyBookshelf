package com.blxt.qbook.dao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.blxt.qbook.bean.BookChapterBean;
import com.blxt.qbook.bean.BookContentBean;
import com.blxt.qbook.bean.BookInfoBean;
import com.blxt.qbook.bean.BookShelfBean;
import com.blxt.qbook.bean.BookSourceBean;
import com.blxt.qbook.bean.BookmarkBean;
import com.blxt.qbook.bean.CookieBean;
import com.blxt.qbook.bean.ReplaceRuleBean;
import com.blxt.qbook.bean.SearchBookBean;
import com.blxt.qbook.bean.SearchHistoryBean;
import com.blxt.qbook.bean.TxtChapterRuleBean;

import com.blxt.qbook.dao.BookChapterBeanDao;
import com.blxt.qbook.dao.BookContentBeanDao;
import com.blxt.qbook.dao.BookInfoBeanDao;
import com.blxt.qbook.dao.BookShelfBeanDao;
import com.blxt.qbook.dao.BookSourceBeanDao;
import com.blxt.qbook.dao.BookmarkBeanDao;
import com.blxt.qbook.dao.CookieBeanDao;
import com.blxt.qbook.dao.ReplaceRuleBeanDao;
import com.blxt.qbook.dao.SearchBookBeanDao;
import com.blxt.qbook.dao.SearchHistoryBeanDao;
import com.blxt.qbook.dao.TxtChapterRuleBeanDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig bookChapterBeanDaoConfig;
    private final DaoConfig bookContentBeanDaoConfig;
    private final DaoConfig bookInfoBeanDaoConfig;
    private final DaoConfig bookShelfBeanDaoConfig;
    private final DaoConfig bookSourceBeanDaoConfig;
    private final DaoConfig bookmarkBeanDaoConfig;
    private final DaoConfig cookieBeanDaoConfig;
    private final DaoConfig replaceRuleBeanDaoConfig;
    private final DaoConfig searchBookBeanDaoConfig;
    private final DaoConfig searchHistoryBeanDaoConfig;
    private final DaoConfig txtChapterRuleBeanDaoConfig;

    private final BookChapterBeanDao bookChapterBeanDao;
    private final BookContentBeanDao bookContentBeanDao;
    private final BookInfoBeanDao bookInfoBeanDao;
    private final BookShelfBeanDao bookShelfBeanDao;
    private final BookSourceBeanDao bookSourceBeanDao;
    private final BookmarkBeanDao bookmarkBeanDao;
    private final CookieBeanDao cookieBeanDao;
    private final ReplaceRuleBeanDao replaceRuleBeanDao;
    private final SearchBookBeanDao searchBookBeanDao;
    private final SearchHistoryBeanDao searchHistoryBeanDao;
    private final TxtChapterRuleBeanDao txtChapterRuleBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        bookChapterBeanDaoConfig = daoConfigMap.get(BookChapterBeanDao.class).clone();
        bookChapterBeanDaoConfig.initIdentityScope(type);

        bookContentBeanDaoConfig = daoConfigMap.get(BookContentBeanDao.class).clone();
        bookContentBeanDaoConfig.initIdentityScope(type);

        bookInfoBeanDaoConfig = daoConfigMap.get(BookInfoBeanDao.class).clone();
        bookInfoBeanDaoConfig.initIdentityScope(type);

        bookShelfBeanDaoConfig = daoConfigMap.get(BookShelfBeanDao.class).clone();
        bookShelfBeanDaoConfig.initIdentityScope(type);

        bookSourceBeanDaoConfig = daoConfigMap.get(BookSourceBeanDao.class).clone();
        bookSourceBeanDaoConfig.initIdentityScope(type);

        bookmarkBeanDaoConfig = daoConfigMap.get(BookmarkBeanDao.class).clone();
        bookmarkBeanDaoConfig.initIdentityScope(type);

        cookieBeanDaoConfig = daoConfigMap.get(CookieBeanDao.class).clone();
        cookieBeanDaoConfig.initIdentityScope(type);

        replaceRuleBeanDaoConfig = daoConfigMap.get(ReplaceRuleBeanDao.class).clone();
        replaceRuleBeanDaoConfig.initIdentityScope(type);

        searchBookBeanDaoConfig = daoConfigMap.get(SearchBookBeanDao.class).clone();
        searchBookBeanDaoConfig.initIdentityScope(type);

        searchHistoryBeanDaoConfig = daoConfigMap.get(SearchHistoryBeanDao.class).clone();
        searchHistoryBeanDaoConfig.initIdentityScope(type);

        txtChapterRuleBeanDaoConfig = daoConfigMap.get(TxtChapterRuleBeanDao.class).clone();
        txtChapterRuleBeanDaoConfig.initIdentityScope(type);

        bookChapterBeanDao = new BookChapterBeanDao(bookChapterBeanDaoConfig, this);
        bookContentBeanDao = new BookContentBeanDao(bookContentBeanDaoConfig, this);
        bookInfoBeanDao = new BookInfoBeanDao(bookInfoBeanDaoConfig, this);
        bookShelfBeanDao = new BookShelfBeanDao(bookShelfBeanDaoConfig, this);
        bookSourceBeanDao = new BookSourceBeanDao(bookSourceBeanDaoConfig, this);
        bookmarkBeanDao = new BookmarkBeanDao(bookmarkBeanDaoConfig, this);
        cookieBeanDao = new CookieBeanDao(cookieBeanDaoConfig, this);
        replaceRuleBeanDao = new ReplaceRuleBeanDao(replaceRuleBeanDaoConfig, this);
        searchBookBeanDao = new SearchBookBeanDao(searchBookBeanDaoConfig, this);
        searchHistoryBeanDao = new SearchHistoryBeanDao(searchHistoryBeanDaoConfig, this);
        txtChapterRuleBeanDao = new TxtChapterRuleBeanDao(txtChapterRuleBeanDaoConfig, this);

        registerDao(BookChapterBean.class, bookChapterBeanDao);
        registerDao(BookContentBean.class, bookContentBeanDao);
        registerDao(BookInfoBean.class, bookInfoBeanDao);
        registerDao(BookShelfBean.class, bookShelfBeanDao);
        registerDao(BookSourceBean.class, bookSourceBeanDao);
        registerDao(BookmarkBean.class, bookmarkBeanDao);
        registerDao(CookieBean.class, cookieBeanDao);
        registerDao(ReplaceRuleBean.class, replaceRuleBeanDao);
        registerDao(SearchBookBean.class, searchBookBeanDao);
        registerDao(SearchHistoryBean.class, searchHistoryBeanDao);
        registerDao(TxtChapterRuleBean.class, txtChapterRuleBeanDao);
    }
    
    public void clear() {
        bookChapterBeanDaoConfig.clearIdentityScope();
        bookContentBeanDaoConfig.clearIdentityScope();
        bookInfoBeanDaoConfig.clearIdentityScope();
        bookShelfBeanDaoConfig.clearIdentityScope();
        bookSourceBeanDaoConfig.clearIdentityScope();
        bookmarkBeanDaoConfig.clearIdentityScope();
        cookieBeanDaoConfig.clearIdentityScope();
        replaceRuleBeanDaoConfig.clearIdentityScope();
        searchBookBeanDaoConfig.clearIdentityScope();
        searchHistoryBeanDaoConfig.clearIdentityScope();
        txtChapterRuleBeanDaoConfig.clearIdentityScope();
    }

    public BookChapterBeanDao getBookChapterBeanDao() {
        return bookChapterBeanDao;
    }

    public BookContentBeanDao getBookContentBeanDao() {
        return bookContentBeanDao;
    }

    public BookInfoBeanDao getBookInfoBeanDao() {
        return bookInfoBeanDao;
    }

    public BookShelfBeanDao getBookShelfBeanDao() {
        return bookShelfBeanDao;
    }

    public BookSourceBeanDao getBookSourceBeanDao() {
        return bookSourceBeanDao;
    }

    public BookmarkBeanDao getBookmarkBeanDao() {
        return bookmarkBeanDao;
    }

    public CookieBeanDao getCookieBeanDao() {
        return cookieBeanDao;
    }

    public ReplaceRuleBeanDao getReplaceRuleBeanDao() {
        return replaceRuleBeanDao;
    }

    public SearchBookBeanDao getSearchBookBeanDao() {
        return searchBookBeanDao;
    }

    public SearchHistoryBeanDao getSearchHistoryBeanDao() {
        return searchHistoryBeanDao;
    }

    public TxtChapterRuleBeanDao getTxtChapterRuleBeanDao() {
        return txtChapterRuleBeanDao;
    }

}
