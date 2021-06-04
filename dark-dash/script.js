var checkbox = document.querySelector('input[name=theme]');

checkbox.addEventListener('change', function () {
	if (this.checked) {
		trans()
		document.documentElement.setAttribute('data-theme', 'dark')
	} else {
		trans()
		document.documentElement.setAttribute('data-theme', 'light')
	}
})

let trans = () => {
	document.documentElement.classList.add('transition');
	window.setTimeout(() => {
		document.documentElement.classList.remove('transition')
	}, 1000)
}

function myFunc() {
	x = document.getElementById('tog');
	if (x.style.display === "none") {
		x.style.display = "block";
	} else {
		x.style.display = "none";
	}
}

var ctx = document.getElementById('chart1').getContext('2d');
var chart1 = new Chart(ctx, {
	type: 'bar',
	data: {
		labels: ['Venkateshwar Hospital', 'Manipal Hospital', 'Aakash Hospital'],
		datasets: [{
			label: 'Hospital Visits',
			data: [7, 3, 5],
			backgroundColor: [
				'rgba(255, 99, 132)',
				'rgba(54, 162, 235)',
				'rgba(255, 206, 86)'
			],
		}]
	},
	options: {
		scales: {
			yAxes: [{
				ticks: {
					beginAtZero: true
				}
			}]
		}
	}
});
var ctx = document.getElementById('chart2').getContext('2d');
var chart2 = new Chart(ctx, {
	type: 'pie',
	data: {
		labels: ['Dr. Vijay', 'Dr. Ashish', 'Dr. Sethi', 'Dr. Vikram', 'Dr. Manish'],
		datasets: [{
			label: 'Doctors Visited',
			data: [2, 3, 4, 3, 2],
			backgroundColor: [
				'rgba(255, 99, 132)',
				'rgba(54, 162, 235)',
				'rgba(255, 206, 86)',
				'#05c270',
				'#6500cd'

			],
		}]
	},
});
var config = {
	type: 'line',
	data: {
		labels: ['January', 'February', 'March', 'April', 'May', 'June', 'July'],
		datasets: [{
			label: 'SGOT',
			fill: false,
			backgroundColor: 'rgba(0,152,255,1)',
			borderColor: 'rgba(0,152,255,1)',
			data: [250, 270, 290, 200, 200, 213, 211],
		}, {
			label: 'SGPT',
			fill: false,
			backgroundColor: 'rgba(0,255,0,1)',
			borderColor: 'rgba(0,255,0,1)',
			borderDash: [5, 5],
			data: [232, 252, 231, 229, 111, 189, 206],
		}, {
			label: 'SALP',
			backgroundColor: 'rgba(220,20,60,1)',
			borderColor: 'rgba(220,20,60,1)',
			data: [302, 196, 309, 204, 259, 209, 257],
			fill: true,
		}]
	},
	options: {
		responsive: true,
		title: {
			display: true,
			text: 'Chart.js Line Chart'
		},
		tooltips: {
			mode: 'index',
			intersect: false,
		},
		hover: {
			mode: 'nearest',
			intersect: true
		},
		scales: {
			xAxes: [{
				display: true,
				scaleLabel: {
					display: true,
					labelString: 'Month'
				}
			}],
			yAxes: [{
				display: true,
				scaleLabel: {
					display: true,
					labelString: 'Value'
				}
			}]
		}
	}
};
var data = {
	labels: ['January', 'February', 'March', 'April', 'May', 'June', 'July'],
	datasets: [
		{
			label: "Glucose",
			backgroundColor: 'rgba(0,152,255,1)',
			borderColor: 'rgba(0,152,255,1)',
			fillColor: "rgba(151,187,205,1)",
			strokeColor: "rgba(151,187,205,1)",
			pointColor: "rgba(151,187,205,1)",
			pointStrokeColor: "#fff",
			pointHighlightFill: "#fff",
			pointHighlightStroke: "rgba(151,187,205,1)",
			data: [80, 100, 84, 80, 90, 95, 110]
		}
	]
};
window.onload = function () {
	var ctx = document.getElementById('chart3').getContext('2d');
	window.myLine = new Chart(ctx, config);
	var ctx = document.getElementById('lineChart').getContext('2d');
	var lineChart = new Chart(ctx, {
		type: 'line',
		data: data,
		options: {
			responsive: true,
			title: {
				display: true,
				text: 'Glucose Levels'
			},
			tooltips: {
				mode: 'index',
				intersect: false,
			},
			hover: {
				mode: 'nearest',
				intersect: true
			},
			scales: {
				xAxes: [{
					display: true,
					scaleLabel: {
						display: true,
						labelString: 'Month'
					}
				}],
				yAxes: [{
					display: true,
					scaleLabel: {
						display: true,
						labelString: 'Value'
					}
				}]
			}
		}
	});

};





