package CourseManagementSystem;


    public class Course {

        private int courseId;
        private String courseName;
        private int duration;
        private double fee;

        public Course(int courseId, String courseName, int duration, double fee) {
            this.courseId = courseId;
            this.courseName = courseName;
            this.duration = duration;
            this.fee = fee;
        }

        public int getCourseId() {
            return courseId;
        }

        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

        public void setFee(double fee) {
            this.fee = fee;
        }

        @Override
        public String toString() {
            return courseId + " | " + courseName + " | " + duration + " months | ₹" + fee;
        }

}
