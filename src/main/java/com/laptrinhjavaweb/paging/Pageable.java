package com.laptrinhjavaweb.paging;

public class Pageable implements Pageble{
    private int limit;
    private int page;
    private Sorter sorter;

    public Pageable(int page, int limit) {
        this.page = page;
        this.limit = limit;
        this.sorter = new Sorter();
    }


    public void setPage(int page) {
        this.page = page;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public void setSorter(Sorter sorter) {
        this.sorter = sorter;
    }

    @Override
    public Integer getPage() {
        return this.page;
    }

    @Override
    public Integer getOffset() {
        return (this.page - 1) * this.limit;
    }
    @Override
    public Integer getLimit() {
        return this.limit;
    }

    @Override
    public Sorter getSorter() {
        return this.sorter;
    }
}
