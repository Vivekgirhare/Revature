// Redirect if not logged in
if (!localStorage.getItem("activeUser")) {
    window.location.href = "index.html";
}

// Set username on top
document.getElementById("username").innerText =
    localStorage.getItem("activeUser");

// Logout
$("#logout").click(function () {
    localStorage.removeItem("activeUser");
    window.location.href = "index.html";
});

// Medium Level Quiz Questions
let questions = [
    {
    q: "Which HTML tag is used to embed JavaScript inside HTML?",
    options: ["javascript", "script", "js", "code"],
    ans: 1
},
    {
        q: "Which HTML attribute is used to make an input field mandatory?",
        options: ["need", "validate", "required", "must"],
        ans: 2
    },
    {
        q: "Which CSS property creates spacing OUTSIDE the border?",
        options: ["padding", "margin", "gap", "spacing"],
        ans: 1
    },
    {
        q: "Which CSS layout provides flexible responsive alignment?",
        options: ["Block Layout", "Grid Layout", "Flexbox", "Inline Layout"],
        ans: 2
    },
    {
        q: "In CSS, what does position: fixed do?",
        options: [
            "Moves element randomly",
            "Positions relative to parent",
            "Positions relative to viewport",
            "Locks element vertically only"
        ],
        ans: 2
    },
    {
        q: "Which JS method selects element by ID?",
        options: [
            "document.querySelectorAll()",
            "document.getElementByClass()",
            "document.getElementByTagName()",
            "document.getElementById()"
        ],
        ans: 3
    },
    {
        q: "What does === check in JavaScript?",
        options: [
            "Only values",
            "Only datatype",
            "Both value & datatype",
            "Same as =="
        ],
        ans: 2
    },
    {
        q: "Which method adds element at end of array?",
        options: ["push()", "append()", "insert()", "addEnd()"],
        ans: 0
    },
    {
        q: "What does NaN mean?",
        options: [
            "Not a Number",
            "Not a Name",
            "Null as Number",
            "No Assigned Number"
        ],
        ans: 0
    },
    {
        q: "Which event triggers on mouse click?",
        options: ["onpress", "onhover", "onclick", "onselect"],
        ans: 2
    }
];

let index = 0;
let score = 0;
let timeLeft = 60;
let timer;

// Load Question
function loadQuestion() {
    if (index >= questions.length) {
        $(".container").html(`
            <div class='topbar'>
                <h2>Great Job, ${localStorage.getItem("activeUser")}!</h2>
                <button onclick="logout()">Logout</button>
            </div>
            <h1>Quiz Finished</h1>
            <div class='result'>Your Score: ${score} / ${questions.length}</div>
        `);
        return;
    }

    $("#question").text((index + 1) + ". " + questions[index].q);
    $(".options").html("");

    questions[index].options.forEach((opt, i) => {
        $(".options").append(`<button onclick="checkAnswer(${i})">${opt}</button>`);
    });

    updateProgress();
    resetTimer();
}

// Progress Bar
function updateProgress() {
    let percent = (index / questions.length) * 100;
    $(".progress").css("width", percent + "%");
}

// Timer
function resetTimer() {
    clearInterval(timer);
    timeLeft = 60;
    $("#time").text(timeLeft);

    timer = setInterval(() => {
        timeLeft--;
        $("#time").text(timeLeft);

        if (timeLeft == 0) {
            nextQuestion();
        }
    }, 1000);
}

// Check Answer
function checkAnswer(i) {
    if (i == questions[index].ans) {
        score++;
    }
    nextQuestion();
}

// Next Question
function nextQuestion() {
    clearInterval(timer);
    index++;
    loadQuestion();
}

// Logout function
function logout() {
    localStorage.removeItem("activeUser");
    window.location.href = "index.html";
}

// Start quiz
$(document).ready(function () {
    loadQuestion();
});
