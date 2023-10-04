const prevMonthBtn = document.getElementById("prev-month");
const nextMonthBtn = document.getElementById("next-month");
const currentMonthText = document.getElementById("current-month");
const calendarBody = document.getElementById("calendar-body");

let currentDate = new Date();

function initCalendar() {
	renderCalendar(currentDate);
}

function renderCalendar(date) {
	currentMonthText.textContent =
		date.toLocaleString("default", { month: "long" }) +
		" " +
		date.getFullYear();
	calendarBody.innerHTML = "";

	const firstDayOfMonth = new Date(date.getFullYear(), date.getMonth(), 1);
	const lastDayOfMonth = new Date(date.getFullYear(), date.getMonth() + 1, 0);
	const daysInMonth = lastDayOfMonth.getDate();
	const startingDay = firstDayOfMonth.getDay();

	let dayCounter = 1;

	for (let i = 0; i < 6; i++) {
		const row = document.createElement("tr");
		for (let j = 0; j < 7; j++) {
			const cell = document.createElement("td");
			if (i === 0 && j < startingDay) {
				cell.textContent = "";
			} else if (dayCounter <= daysInMonth) {
				cell.textContent = dayCounter;
				if (
					date.getDate() === dayCounter &&
					date.getMonth() === currentDate.getMonth()
				) {
					cell.classList.add("current-day");
				}
				dayCounter++;
			}
			row.appendChild(cell);
		}
		calendarBody.appendChild(row);
	}
}

prevMonthBtn.addEventListener("click", () => {
	currentDate.setMonth(currentDate.getMonth() - 1);
	renderCalendar(currentDate);
});

nextMonthBtn.addEventListener("click", () => {
	currentDate.setMonth(currentDate.getMonth() + 1);
	renderCalendar(currentDate);
});
initCalendar();
