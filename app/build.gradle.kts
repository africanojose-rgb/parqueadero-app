android { 
    compileSdk = 33 

    defaultConfig { 
        applicationId = "com.example.parqueadero"
        minSdk = 21 
        targetSdk = 33 
        versionCode = 1 
        versionName = "1.0" 
    } 
    buildTypes { 
        getByName("release") { 
            isMinifyEnabled = false 
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro") 
        } 
    } 
} 
