package api_pojo;

public class PageablePojo {


        public SortPojo sort;
        public int offset;
        public int pageSize;
        public int pageNumber;
        public boolean paged;
        public boolean unpaged ;

        public PageablePojo(){

        }

    public PageablePojo(SortPojo sort, int offset, int pageSize, int pageNumber, boolean paged, boolean unpaged) {
        this.sort = sort;
        this.offset = offset;
        this.pageSize = pageSize;
        this.pageNumber = pageNumber;
        this.paged = paged;
        this.unpaged = unpaged;
    }

    public SortPojo getSort() {
        return sort;
    }

    public void setSort(SortPojo sort) {
        this.sort = sort;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public boolean isPaged() {
        return paged;
    }

    public void setPaged(boolean paged) {
        this.paged = paged;
    }

    public boolean isUnpaged() {
        return unpaged;
    }

    public void setUnpaged(boolean unpaged) {
        this.unpaged = unpaged;
    }

    @Override
    public String toString() {
        return "PageablePojo{" +
                "sort=" + sort +
                ", offset=" + offset +
                ", pageSize=" + pageSize +
                ", pageNumber=" + pageNumber +
                ", paged=" + paged +
                ", unpaged=" + unpaged +
                '}';
    }
}
