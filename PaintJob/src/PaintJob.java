public class PaintJob {
    // write your code here
    public static int getBucketCount(double width, double height, double arePerBucket, int extraBucket){
        if(width<=0||height<=0||arePerBucket<=0||extraBucket<0){
            return -1;
        }
        double area = width*height;
        double bucket = Math.ceil(area/arePerBucket);
        return (int)(bucket-extraBucket);
    }

    public static int getBucketCount(double width, double height, double arePerBucket){
        if(width<=0||height<=0||arePerBucket<=0){
            return -1;
        }
        double area = width*height;
        double bucket = Math.ceil(area/arePerBucket);
        return (int)bucket;
    }

    public static int getBucketCount(double area,double arePerBucket){
        if(area<=0||arePerBucket<=0){
            return -1;
        }
        double bucket = Math.ceil(area/arePerBucket);
        return (int)bucket;
    }
}