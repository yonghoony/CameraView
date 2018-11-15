package com.otaliastudios.cameraview;

public enum VideoRecordState {

    /**
     * Not recording.
     * The camera can enter this state from any other state especially when a camera error happens.
     */
    IDLE,

    /**
     * The user has started recording and the camera is scheduled to start recording in a worker thread.
     */
    SCHEDULED_TO_START,

    /**
     * The camera started executing the task to start video recording in a worker thread.
     */
    STARTING,

    /**
     * The camera has started recording.
     */
    STARTED,

    /**
     * The user has ended recording and the camera is scheduled to stop recording in a worker thread.
     */
    SCHEDULED_TO_END,

    /**
     * The camera started executing the task to end video recording in a worker thread.
     */
    ENDING,
}
