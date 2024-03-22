import subprocess

def run_randoop_command(jar_path, package_name, output_dir, regression_basename, test_class):
    command = [
        "java",
        "-cp",
        f"{jar_path}:/Users/karangeorge/Development/Evosuite/team3/Evo/target/classes/",
        "randoop.main.Main",
        "gentests",
        f"--junit-package-name={package_name}",
        f"--junit-output-dir={output_dir}",
        f"--regression-test-basename={regression_basename}",
        "--stop-on-error-test=true",
        f"--testclass=correct_java_programs.{test_class}"
    ]

    print(' '.join(command))
    subprocess.run(command)

# List of packages and corresponding test classes
packages_classes = [
    ("correct_java_programs.sqrt", "SQRT"),
    ("correct_java_programs.subsequences", "SUBSEQUENCES"),
    ("correct_java_programs.to_base", "TO_BASE")
]

# Example usage
jar_path = "/Users/karangeorge/Downloads/randoop-4.3.2/randoop-all-4.3.2.jar"
output_dir = "/Users/karangeorge/Development/Evosuite/team3/Evo/src/test/java/"

# Execute Randoop commands for each package and class
for package, test_class in packages_classes:
    regression_basename = f"Randoop_{test_class}_Regression"
    run_randoop_command(jar_path, package, output_dir, regression_basename, test_class)
