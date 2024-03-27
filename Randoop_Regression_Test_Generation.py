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
        f"--testclass=java_programs.{test_class}"
    ]

    print(' '.join(command))
    subprocess.run(command)

# List of packages and corresponding test classes
packages_classes = [

    ("java_programs.gcd", "GCD"),
    ("java_programs.get_factors", "GET_FACTORS"),
    ("java_programs.is_valid_parenthesization", "IS_VALID_PARENTHESIZATION"),
    ("java_programs.knapsack", "KNAPSACK"),
    ("java_programs.kth", "KTH"),
    ("java_programs.levenshtein", "LEVENSHTEIN"),
    ("java_programs.lis", "LIS"),
    ("java_programs.max_sublist_sum", "MAX_SUBLIST_SUM"),
    ("java_programs.next_palindrome", "NEXT_PALINDROME"),
    ("java_programs.next_permutation", "NEXT_PERMUTATION"),
    ("java_programs.pascal", "PASCAL"),
    ("java_programs.shunting_yard", "SHUNTING_YARD"),
    ("java_programs.sieve", "SIEVE"),
    ("java_programs.sqrt", "SQRT"),
    ("java_programs.subsequences", "SUBSEQUENCES"),
    ("java_programs.to_base", "TO_BASE")
]

# Example usage
jar_path = "/Users/karangeorge/Downloads/randoop-4.3.2/randoop-all-4.3.2.jar"
output_dir = "/Users/karangeorge/Development/Evosuite/team3/Evo/src/test/java/"

# Execute Randoop commands for each package and class
for package, test_class in packages_classes:
    regression_basename = f"Randoop_{test_class}_Buggy_Regression"
    run_randoop_command(jar_path, package, output_dir, regression_basename, test_class)
