package com.sjms.Decorator.iterator;
/**
 * <dl>
 * <dt> BookShelfIterator</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/2/5</dd>
 * </dl>
 *
 * @author lizhu
 */
public class BookShelfIterator implements Iterator{
    private BookShelf bookShelf;
    private int index = 0;
    public BookShelfIterator(BookShelf bookShelf){
       this.bookShelf = bookShelf;
    }
    @Override
    public boolean hasNext() {
        if(index < bookShelf.getLenth()){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index ++;
        return book;
    }
}
