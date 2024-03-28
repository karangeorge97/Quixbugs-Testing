import subprocess
import os
import shutil


def run_maven_command(package_name, test_class):
    command = [
        "mvn",
        "clean",
        "clover:setup",
        "test",
        f"-Dtest={package_name}.{test_class}_ESTest",
        "clover:aggregate",
        "clover:clover"
    ]
    subprocess.run(command)


def run_custom_test(package_name, test_class):
    command = [
        "mvn",
        "test",
        f"-Dtest={package_name}.Randoop_{test_class}_Buggy_Regression.java"
    ]
    subprocess.run(command)


# List of packages and corresponding test classes
packages_classes = [
    ("correct_java_programs.depth_first_search", "DEPTH_FIRST_SEARCH"),
    # Add more packages and test classes here
]

output_base_dir = "/Users/karangeorge/Desktop/527/QuixBugs/"

for package, test_class in packages_classes:
    run_custom_test(package, test_class)
    target_folder = "target"
    new_target_name = f"target_{test_class}"
    if os.path.exists(target_folder):
        os.rename(target_folder, new_target_name)

    # Copying index.html
    source_index_html = f"/Users/karangeorge/Development/Evosuite/team3/Evo/{new_target_name}/site/clover/index.html"
    destination_dir = os.path.join(output_base_dir, test_class, "Coverage", "Buggy-version-Randoop test coverage")
    os.makedirs(destination_dir, exist_ok=True)
    shutil.copy(source_index_html, destination_dir)

    # Running custom test
