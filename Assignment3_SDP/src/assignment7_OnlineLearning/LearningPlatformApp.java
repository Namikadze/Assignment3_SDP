package assignment7_OnlineLearning;

public class LearningPlatformApp {
    public static void main(String[] args) {
        OnlineCourse course = new OnlineCourse();

        VideoLecture lecture1 = new ProxyVideoLecture("Software Design Patterns");
        VideoLecture lecture2 = new ProxyVideoLecture("Object Oriented Programming");

        course.addLecture(lecture1);
        course.addLecture(lecture2);

        course.showLectureList();

        System.out.println("Playing lecture 1:");
        course.playLecture(0);

        System.out.println("Playing lecture 2:");
        course.playLecture(1);
    }
}