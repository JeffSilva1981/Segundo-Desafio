package com.academicevent.academicevent.entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "tb_block")
public class Block {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant startTime;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Instant endTime;

    @OneToOne
    @MapsId
    @JoinColumn(name = "activity_id")
    private Activity activity;

    public Block(){

    }

    public Block(Integer id, Instant star, Instant end, Activity activity) {
        this.id = id;
        this.startTime = star;
        this.endTime = end;
        this.activity = activity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getStartTime() {
        return startTime;
    }

    public void setStartTime(Instant startTime) {
        this.startTime = startTime;
    }

    public Instant getEndTime() {
        return endTime;
    }

    public void setEndTime(Instant endTime) {
        this.endTime = endTime;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}
