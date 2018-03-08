package com.sjms.Decorator.iterator;

/**
 * <dl>
 * <dt> BookShelf</dt>
 * <dd>Description:</dd>
 * <dd>Copyright: Copyright (C) 2016</dd>
 * <dd>Company: 青牛（北京）技术有限公司</dd>
 * <dd>CreateDate:2018/2/5</dd>
 * </dl>
 *
 * @author lizhu
 */
public class BookShelf implements Aggregate{
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxSize){
        this.books = new Book[maxSize];
    }

    public Book getBookAt(int index){
        return books[index];
    }

    public BookShelf appendBook(Book book){
        this.books[last] = book;
        this.last++;
        return this;
    }

    public int getLenth(){
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
