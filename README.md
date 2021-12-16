# current-location

## Setup

Update your module level build.gradle file and add the following dependency. Please check the project releases for latest versions.

    dependencies {
      implementation project(path: ':bottomnavigation')
    }
    
   
Update your MainActivity or make change in which activity you want to get location. 
    
    public class MainActivity extends BaseActivity implements CurrentLocationListener {
    
        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            new BaseActivity(this);
        }

        @Override
        public void currentLocation(double latitude, double longitude) {
            // your latitude and longitude
        }
    }
    

    
    
   
