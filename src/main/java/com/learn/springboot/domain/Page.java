package com.learn.springboot.domain;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Description: 分页对象
 * <p>
 * User: Administrator
 * Date: 2017-08-28
 * Time: 8:47
 */
public class Page<T> {

    /** 当前页, 默认第一页 */
    private int pageNum;

    /** 每页记录数 */
    private int pageSize;

    /** 总记录数 */
    private int totalRecord;

    /** 总页数 */
    private int totalPage;

    /** 包装数据的list */
    private List<T> results;

    /** 分装参数 */
    private Map<String, Object> params = new ConcurrentHashMap<>();

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public List<T> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
    }

    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    /**
     * (pageNum - 1) * pageSize
     */
    protected void computeTotalPage() {
        if (getPageSize() > 0 && getTotalRecord() > -1) {
            this.totalPage = (int) (getTotalRecord() % getPageSize() == 0
                    ? getTotalRecord() / getPageSize()
                    : getTotalRecord() / getPageSize() + 1);
        }
    }

    @Override
    public String toString() {
        return "Page{" +
                "pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                ", totalRecord=" + totalRecord +
                ", totalPage=" + totalPage +
                ", results=" + results +
                ", params=" + params +
                '}';
    }
}
