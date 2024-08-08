# Gradle Multiplatform Jar Boilerplate
This project is a template for creating multi-platform Minecraft plugins/mods that support Bukkit, Fabric, Velocity or any other Minecraft server software you could think of.

## Getting Started
### Prerequisites
- JDK 8 or higher
- Gradle

## Setup
1. **Fork and Clone the Repository:**
   - Fork this repository to create your own copy.
   - Clone your forked repository to your local machine:
       ```shell
       git clone https://github.com/yourusername/gradle-multiplatformjar-boilerplate.git
       cd gradle-multiplatformjar-boilerplate
       ```
2. **Rename Project and Packages:**
   - Update the project name in `settings.gradle`:
       ```gradle
       rootProject.name = 'MyMultiPlatformMinecraftPlugin'
       ```
   - Change the root project name in `build.gradle`:
       ```gradle
       archivesBaseName = 'MyMultiPlatformMinecraftPlugin'
       ```
   - Rename the packages in the `common`, `bukkit`, and `fabric` modules to reflect your new plugin name.
3. **Update Metadata:**
   - Modify `gradle.properties` with new plugin details.
   - Update any plugin descriptors:
       - `bukkit/src/main/resources/plugin.yml`
       - `fabric/src/main/resources/fabric.mod.json`
4. **Change Repository URL:**
    - Remove the existing Git remote:
       ```shell
       git remote remove origin
       ```
    - Add your own repository as the new remote:
       ```shell
       git remote add origin https://github.com/yourusername/your-new-plugin-repo.git
       ```
5. **Commit and Push Changes:**
   - Commit your changes:
       ```shell
       git commit -am "Renamed project and updated details"
       ```
   - Push to your new repository:
       ```shell
       git push origin master
       ```

## Project Structure
- `common/` - Common code shared between platforms.
- `bukkit/` - Bukkit-specific implementation.
- `fabric/` - Fabric-specific implementation.
- ...

## Building the Project
This command will build a jar file containing the common as well as all implementation-specific classes, 
configuration files, and libraries configured to be shaded in. If done correctly, this jar will execute 
on all supported server software.
```gradle
gradle clean build
```