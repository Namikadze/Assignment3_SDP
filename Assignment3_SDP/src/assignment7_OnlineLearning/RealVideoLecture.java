package assignment7_OnlineLearning;

public class RealVideoLecture implements VideoLecture {
    private String lectureName;

    public RealVideoLecture(String lectureName) {
        this.lectureName = lectureName;
        loadLectureFromDisk();
    }

    private void loadLectureFromDisk() {
        System.out.println("Loading video lecture: " + lectureName);
    }

    @Override
    public void getInfo() {
        System.out.println("Video Lecture: " + lectureName);
    }

    @Override
    public void play() {
        System.out.println("Playing video lecture: " + lectureName);
    }
}