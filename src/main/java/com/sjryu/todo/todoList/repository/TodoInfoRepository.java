package com.sjryu.todo.todoList.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sjryu.todo.todoList.entity.TodoInfoEntity;


@Repository
public interface TodoInfoRepository extends JpaRepository<TodoInfoEntity, Long>{
    public java.util.List<TodoInfoEntity> findAllByMiSeq(Long miSeq);
    public TodoInfoEntity findBySeq(Long seq);
    public void deleteBySeqAndMiSeq(Long seq, Long miSeq);
    public TodoInfoEntity findBySeqAndMiSeq(Long seq, Long miSeq);
    // select * feom todo_info where ti_end_dt between [start] and [end] and
    // ti_mi_seq = [miSeq] 
    public List<TodoInfoEntity> findByEndDtBetweenAndMiSeq(Date start, Date end, Long miSeq);
}
