package com.example.demo.model;

import software.amazon.awssdk.services.s3.model.Owner;

public class S3BucketMetaData {

    private String key;
    private Long size;
    private Owner owner;

    public S3BucketMetaData(String key, Long size, Owner owner) {
        this.key = key;
        this.size = size;
        this.owner = owner;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        S3BucketMetaData that = (S3BucketMetaData) o;

        if (!key.equals(that.key)) return false;
        return size.equals(that.size);
    }

    @Override
    public int hashCode() {
        int result = key.hashCode();
        result = 31 * result + size.hashCode();
        return result;
    }
}
