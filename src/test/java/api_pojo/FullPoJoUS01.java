package api_pojo;

import java.util.List;

public class FullPoJoUS01 {

        public List<ContentPojo> content;
        public PageablePojo pageable;
        public int totalPages;
        public int totalElements;
        public boolean last;
        public int number;
        public SortPojo sort;
        public int size;
        public int numberOfElements;
        public boolean first;
        public boolean empty;

    public FullPoJoUS01() {
    }

    public FullPoJoUS01(List<ContentPojo> content, PageablePojo pageable, int totalPages, int totalElements, boolean last, int number, SortPojo sort, int size, int numberOfElements, boolean first, boolean empty) {
        this.content = content;
        this.pageable = pageable;
        this.totalPages = totalPages;
        this.totalElements = totalElements;
        this.last = last;
        this.number = number;
        this.sort = sort;
        this.size = size;
        this.numberOfElements = numberOfElements;
        this.first = first;
        this.empty = empty;
    }

    public List<ContentPojo> getContent() {
        return content;
    }

    public void setContent(List<ContentPojo> content) {
        this.content = content;
    }

    public PageablePojo getPageable() {
        return pageable;
    }

    public void setPageable(PageablePojo pageable) {
        this.pageable = pageable;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(int totalElements) {
        this.totalElements = totalElements;
    }

    public boolean isLast() {
        return last;
    }

    public void setLast(boolean last) {
        this.last = last;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public SortPojo getSort() {
        return sort;
    }

    public void setSort(SortPojo sort) {
        this.sort = sort;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }

    public void setNumberOfElements(int numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    public boolean isFirst() {
        return first;
    }

    public void setFirst(boolean first) {
        this.first = first;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    @Override
    public String toString() {
        return "FullPoJoUS01{" +
                "content=" + content +
                ", pageable=" + pageable +
                ", totalPages=" + totalPages +
                ", totalElements=" + totalElements +
                ", last=" + last +
                ", number=" + number +
                ", sort=" + sort +
                ", size=" + size +
                ", numberOfElements=" + numberOfElements +
                ", first=" + first +
                ", empty=" + empty +
                '}';
    }
}
