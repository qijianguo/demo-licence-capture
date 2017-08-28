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

    private static final int DEFAULT_PAGE_SIZE = 10;

    /** 当前页, 默认第一页 */
    private int pageNum = 1;

    /** 每页记录数 */
    private int pageSize = DEFAULT_PAGE_SIZE;

    /** 总记录数 */
    private int totalRecord = -1;

    /** 总页数 */
    private int totalPage = -1;

    /** 包装数据的list */
    private List<T> results;

    /** 分装参数 */
    private Map<String, Object> params = new ConcurrentHashMap<>();

    public static int getDefaultPageSize() {
        return DEFAULT_PAGE_SIZE;
    }

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
        computeTotalPage();
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
        computeTotalPage();
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
}
