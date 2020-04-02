package com.blxt.qbook.presenter.contract;

import android.app.Activity;
import android.content.Intent;

import com.kunfei.basemvplib.impl.IPresenter;
import com.kunfei.basemvplib.impl.IView;
import com.blxt.qbook.bean.BookChapterBean;
import com.blxt.qbook.bean.BookShelfBean;
import com.blxt.qbook.bean.BookSourceBean;
import com.blxt.qbook.bean.BookmarkBean;
import com.blxt.qbook.bean.SearchBookBean;
import com.blxt.qbook.presenter.ReadBookPresenter;
import com.blxt.qbook.service.ReadAloudService;

import java.util.List;

public interface ReadBookContract {
    interface View extends IView {

        String getNoteUrl();

        Boolean getAdd();

        void setAdd(Boolean isAdd);

        void changeSourceFinish(BookShelfBean book);

        void startLoadingBook();

        void upMenu();

        void openBookFromOther();

        void showBookmark(BookmarkBean bookmarkBean);

        void skipToChapter(int chapterIndex, int pageIndex);

        void onMediaButton(String cmd);

        void upAloudState(ReadAloudService.Status state);

        void upAloudTimer(String timer);

        void readAloudStart(int start);

        void readAloudLength(int readAloudLength);

        void refresh(boolean recreate);

        void finish();

        void recreate();

        void upAudioSize(int audioSize);

        void upAudioDur(int audioDur);
    }

    interface Presenter extends IPresenter {

        void loadBook(Intent intent);

        BookShelfBean getBookShelf();

        List<BookChapterBean> getChapterList();

        BookChapterBean getDurChapter();

        void setChapterList(List<BookChapterBean> chapterList);

        void saveBook();

        void saveProgress();

        void addToShelf(final ReadBookPresenter.OnAddListener Listener);

        void removeFromShelf();

        void initData(Activity activity);

        void openBookFromOther(Activity activity);

        void addDownload(int start, int end);

        void changeBookSource(SearchBookBean searchBookBean);

        void autoChangeSource();

        void saveBookmark(BookmarkBean bookmarkBean);

        void delBookmark(BookmarkBean bookmarkBean);

        void disableDurBookSource();

        BookSourceBean getBookSource();
    }
}
